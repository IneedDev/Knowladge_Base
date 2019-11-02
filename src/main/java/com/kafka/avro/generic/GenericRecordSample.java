package com.kafka.avro.generic;

import org.apache.avro.Schema;
import org.apache.avro.file.*;
import org.apache.avro.generic.*;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;

import java.io.File;
import java.io.IOException;

public class GenericRecordSample {

    public static void main(String[] args) {
        /*
    create:
    schema
    generic record
    write generic record to file avsc
    interpret as a generic record

     */
        Schema.Parser parser = new Schema.Parser();
        // string to schema
        Schema schema = parser.parse("{\n" +
                "     \"type\": \"record\",\n" +
                "     \"namespace\": \"com.example\",\n" +
                "     \"name\": \"Customer\",\n" +
                "     \"doc\": \"Avro Schema for our Customer\",     \n" +
                "     \"fields\": [\n" +
                "       { \"name\": \"first_name\", \"type\": \"string\", \"doc\": \"First Name of Customer\" },\n" +
                "       { \"name\": \"last_name\", \"type\": \"string\", \"doc\": \"Last Name of Customer\" },\n" +
                "       { \"name\": \"age\", \"type\": \"int\", \"doc\": \"Age at the time of registration\" },\n" +
                "       { \"name\": \"height\", \"type\": \"float\", \"doc\": \"Height at the time of registration in cm\" },\n" +
                "       { \"name\": \"weight\", \"type\": \"float\",\"default\": 100, \"doc\": \"Weight at the time of registration in kg\" },\n" +
                "       { \"name\": \"automated_email\", \"type\": \"boolean\", \"default\": true, \"doc\": \"Field indicating if the user is enrolled in marketing emails\" }\n" +
                "     ]\n" +
                "}");
        GenericRecordBuilder customerBuilder = new GenericRecordBuilder(schema);
        customerBuilder.set("first_name", "John");
        customerBuilder.set("last_name", "Doe");
        customerBuilder.set("age", 26);
        customerBuilder.set("height", 175f);

        // now defaults will popup:

//        customerBuilder.set("weight", 70.5f);
//        customerBuilder.set("automated_email", false);

        //write schema to file
        GenericData.Record customer = customerBuilder.build();
        System.out.println("print out object based on schema: " + customer);

        final DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>();
        try (DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter)){
            dataFileWriter.create(schema, new File("src/main/resources/customer-generic-output.avro"));
        }catch (IOException e){
            e.getMessage();
        }

        // above procedure will generate avro file based on path
        // to read it it's necessary encode it by DatumFilereader

        //read avro file
        final  File file = new File("src/main/resources/customer-generic-output.avro");
        final DatumReader<org.apache.avro.generic.GenericRecord> datumReader = new GenericDatumReader<>();

        GenericRecord customerRead;

        try (DataFileReader<org.apache.avro.generic.GenericRecord> dataFileReader = new DataFileReader<>(file,datumReader)){
            customerRead = dataFileReader.next();
            System.out.println("ok read avro file");
            System.out.println(customerRead.toString());
            System.out.println(customerRead.get("first_name"));
        }catch (IOException e){
            e.getMessage();
        }

        // for nested avro objects

        // string to schema
        Schema schemaNestedPbjects = parser.parse("    {\"type\":\"record\",\"" +
                "name\":\"CustomerProfileProperties\",\"namespace\":\"com.company.model.cps\",\"fields\":[{\"" +
                "name\":\"profileProperties\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"" +
                "name\":\"CustomerProfileProperty\",\"symbols\":[\"hardUser\",\"newUser\",\"anyStackedParcel\",\"fakePhoneNumber\"]}}]},{\"" +
                "name\":\"profileStaticProperties\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"" +
                "name\":\"CustomerProfileStaticPropertyName\",\"symbols\":[\"inMobileUser\"]}}],\"default\":[]},{\"" +
                "name\":\"profileCreationTimestamp\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"" +
                "name\":\"profileRefreshTimestamp\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"" +
                "name\":\"lastDeliveredParcelTimestamp\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}\n");


        final GenericData.Record customerProfileProperty = new GenericData.Record(schema.getField("CustomerProfileProperty").schema());
        customerProfileProperty.put("symbol", "hardUser");


        GenericData.Record avroRecord = new GenericData.Record(schemaNestedPbjects);
        avroRecord.put("profileProperties", customerProfileProperty);

    }


}
