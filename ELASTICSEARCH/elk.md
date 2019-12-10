


#### get all indexes 

    curl -XGET http://localhost:8080/_aliases?pretty=true
    
    
#### put template 

        curl -H 'Content-Type: application/json' -XPUT http://localhost:9200/_template/foobar_docs -d '
        {
          "index_patterns": [
            "foo-*", "bar-*"
          ], 
          "settings": {
            "number_of_shards": 1, 
            "number_of_replicas": 2
          }, 
          "mappings": {
            "type1": {
              "_source": {"enabled": true}, 
              "properties": {"created_at": {"type": "date"}, 
              "title": {"type": "text"}, 
              "status": {"type": "keyword"}, 
              "content": {"type":"text"}, 
              "first_name": {"type": "keyword"}, 
              "last_name": {"type": "keyword"}, 
              "age": {"type":"integer"}, 
              "registered": {"type": "boolean"}
              }
            }
          }
        }'
        
#### create index

        $ curl -H 'Content-Type: application/json' -XPUT http://localhost:9200/test-2018.07.20
        {"acknowledged":true,"shards_acknowledged":true,"index":"index_name"}
    
#### get mapping

         curl -XGET 'localhost:8080/index_name/_mapping?pretty'

