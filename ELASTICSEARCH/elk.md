Indeks - zbior dokumentow, danych ktore sa podobne do siebie maja podobna charakterystyke. Indeksy przechowywane so w tzw shard, ktory moze miec swoja replikę.
Shard - pudelko na dane - pelno funkcjonalny indeks ktory moze byc hsotowany na Nod-zie i pozwala na skalowanie
Replica - kopia shardu - backup w momencie kiedy Nod padnie i tym samym shard padnie.

<p align="center"> INDEX = SHARD +  REPLICA </p>


#### INDEX (twitter - indeks name)

    curl -X PUT "localhost:9200/twitter?pretty" -H 'Content-Type: application/json' -d'
    {
        "settings" : {
            "index" : {
                "number_of_shards" : 3, 
                "number_of_replicas" : 2 
            }
        }
    }
    '

#### create index

        $ curl -H 'Content-Type: application/json' -XPUT http://localhost:9200/test-2018.07.20
        {"acknowledged":true,"shards_acknowledged":true,"index":"index_name"}
        
        
        curl -XPUT 'http://localhost:9200/blog/user/dilbert' -'{ "name" : "Dilbert Brown" }'son' -d '
        
        response:
        {"_index":"blog","_type":"user","_id":"dilbert","_version":1,"result":"created","_shards":{"total":2,"successful":1,"failed":0},"_seq_no":0,"_primary_term":1}

#### get all indexes 

    curl -XGET http://localhost:8080/_aliases?pretty=true
    
#### stat index

    GET _cat/indexses?v
    
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
        
    
#### get mapping

         curl -XGET 'localhost:8080/index_name/_mapping?pretty'
         
#### installation

    wget https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.2.0-linux-x86_64.tar.gz
    tar -zxvf elasticsearch-7.2.0-linux-x86_64.tar.gz
    cd elasticsearch-7.2.0
    bin/elasticsearch


