package com.kafka.avro.reflection;

import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class ReflectionRecordSample {

    public static void main(String[] args) {

        //reflection to use schema

        Schema schema = ReflectData.get().getSchema(Customer.class);
        System.out.println("Schema = " + schema.toString(true));

        // write to file reflection
        try {
            File file = new File("customer-reflection-outpu.avro");
            DatumWriter<Customer> writer = new ReflectDatumWriter<>(Customer.class);
            DataFileWriter<Customer> out = new DataFileWriter<>(writer)
                    .setCodec(CodecFactory.deflateCodec(9))
                    .create(schema,file);

            out.append(new Customer("Test","test", "dsdsds"));

        }catch (IOException e){
            e.getMessage();
        }
    }
}
