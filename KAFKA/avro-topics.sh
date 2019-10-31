# !/bin/bash

kafka-avro-console-producer     --broker-list 127.0.0.1:9092 --topic CustomerProfileKey     --property schema.registry.url=http://127.0.0.1:8081     --property value.schema='{"type":"record","name":"CustomerProfileKey","namespace":"com.inpost.model.cps","fields":[{"name":"phoneNum","type":{"type":"string","avro.java.string":"String"}}]}'
#{"phoneNum": "2323232"}

kafka-avro-console-producer     --broker-list 127.0.0.1:9092 --topic CustomerProfileStaticPropertyAction     --property schema.registry.url=http://127.0.0.1:8081 --property value.schema='{"type":"enum","name":"CustomerProfileStaticPropertyAction","namespace":"com.inpost.model.cps","symbols":["append","remove"]}'
#{"CustomerProfileStaticPropertyAction": "append"}

kafka-avro-console-producer     --broker-list 127.0.0.1:9092 --topic CustomerProfileStaticPropertyName     --property schema.registry.url=http://127.0.0.1:8081 --property value.schema='{"type":"enum","name":"CustomerProfileStaticPropertyName","namespace":"com.inpost.model.cps","symbols":["inMobileUser"]}'
#{"CustomerProfileStaticPropertyName": "inMobileUser"}

kafka-avro-console-producer     --broker-list 127.0.0.1:9092 --topic CustomerProfileProperty     --property schema.registry.url=http://127.0.0.1:8081 --property value.schema='{"type":"enum","name":"CustomerProfileProperty","namespace":"com.inpost.model.cps","symbols":["hardUser","newUser","anyStackedParcel","fakePhoneNumber"]}'
#{"CustomerProfileProperty": "newUser"}

kafka-avro-console-producer     --broker-list 127.0.0.1:9092 --topic CustomerProfileProperties     --property schema.registry.url=http://127.0.0.1:8081 --property value.schema='{"type":"record","name":"CustomerProfileProperties","namespace":"com.inpost.model.cps","fields":[{"name":"profileProperties","type":[{"type":"array","items":{"type":"enum","name":"CustomerProfileProperty","symbols":["hardUser","newUser","anyStackedParcel","fakePhoneNumber"]}}]},{"name":"profileStaticProperties","type":[{"type":"array","items":{"type":"enum","name":"CustomerProfileStaticPropertyName","symbols":["inMobileUser"]}}],"default":[]},{"name":"profileCreationTimestamp","type":["null","long"],"default":null,"logicalType":"timestamp-millis"},{"name":"profileRefreshTimestamp","type":["null","long"],"default":null,"logicalType":"timestamp-millis"},{"name":"lastDeliveredParcelTimestamp","type":["null","long"],"default":null,"logicalType":"timestamp-millis"}]}'
#{"CustomerProfileProperties": "newUser"}

