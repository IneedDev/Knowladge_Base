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

