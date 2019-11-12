package com.kafka.avro.specific;

import com.example.Customer;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class SpecificRecordSample {

    public static void main(String[] args) {


        //class from generated sources

        Customer.Builder customerBuilder =  Customer.newBuilder();
        customerBuilder.setAge(25);
        customerBuilder.setFirstName("Pawel");
        customerBuilder.setHeight(15);
        customerBuilder.setWeight(52);
        customerBuilder.setLastName("Romaniuk");
        Customer customer = customerBuilder.build();

        System.out.println(customer.toString());

        // write to file
        final DatumWriter<Customer> datumWriter = new SpecificDatumWriter<>(Customer.class);
        try (DataFileWriter<Customer> dataFileWriter = new DataFileWriter<>(datumWriter)){
            dataFileWriter.create(customer.getSchema(),new File("customer-specific-output.avro"));
            dataFileWriter.append(customer);
            System.out.println("Written customer-specific.avro");
        }catch (IOException e){
            e.getMessage();
        }

        // above procedure will generate avro file into target directory
        // to read it it's necessary encode it by DatumFilereader

        final  File file = new File("customer-specific.avro");
        final DatumReader<Customer> datumReader = new SpecificDatumReader<>(Customer.class);
        final DataFileReader<Customer> dataFileReader;

        try {
            dataFileReader = new DataFileReader<>(file,datumReader);
            while (dataFileReader.hasNext()){
                Customer readCustomer = dataFileReader.next();
                System.out.println(readCustomer.toString());
                System.out.println("First name "+ customer.getFirstName());
            }
        }catch (IOException e){
            e.getMessage();
        }
    }

}