A deployment is an object in Kubernetes that lets you manage a set of identical pods.

A deployment is responsible for keeping a set of pods running.

A service is responsible for enabling network access to a set of pods.

A Pod (as in a pod of whales or pea pod) is a group of one or more containers (such as Docker containers). Containers within a Pod share an IP address and port space, and can find each other via localhost.
Applications within a Pod also have access to shared volumes, which are defined as part of a Pod and are made available to be mounted into each application’s filesystem.

Service - define logical set of PODS

## POD

- edytowanie POD-a równa sie przebudowanie POD-a
- moze uruchomic ieksza liczbe kontenerow
- mozna podlaczyc zewnetrzy storgae - volume

### Tworzenie POD
- yaml
- k8s dashboard

````
appiVersion: v1
kind: Pod
metadata:
    name: (POD Name) fussy
spec:
    containers:
    - image: image_name:TAG
      name: fussy
````

### Komendy

- kubestl create -f file_name.yaml
- kubectl get pods // lista dostepnych podow
- kubectl get pod -Lapp // -Lapp dostawia kolumne APP nazwa
- kubectl describe POD_NAME
- kubectl logs -f -c CONTAINER_NAME POD_NAME
- kubectl edit pod POD_NAME // 



### Tworzenie POD-a z dwoma kontenerami 

````
apiVersion: v1
kind: Pod
metadata:
  name: consumer-producer
spec:
  restartPolicy: Never
  volumes:
  - name: shared-data
    emptyDir: {}

  containers:
  - name: producer
    image: debian
    volumeMounts:
    - name: shared-data
      mountPath: /data
    command: ["/bin/sh"]
    args: ["-c", "while :;do echo \"[$(date)] Hello there - I have really good products to offer\";sleep 10;done >> /data/offer.txt"]

  - name: consumer
    image: cloudowski/fussy-container:0.1
    volumeMounts:
    - name: shared-data
      mountPath: /offer
    command: ["/bin/sh"]
    args: ["-c", "tail -F /offer/offer.txt"]
````

## ReplicaSet
- zarzadza iloscia podów
- name z metadata bedzie prefixem do wsystkich podow, ktorymi bedzie zarzadzac ReplicaSet
- kontroluje liczbe POD-ów zapewnia stałą ich liczbe w momencie usunięcia jednego z POD-ów automatycznie tworzy sie nowy
- skalowanie odbywa sie na podstawie zuzycia procesora

````
apiVersion: extensions/v1beta1
kind: ReplicaSet
metadata:
  name: nginxrs
  labels:
    app: nginx
spec:
  replicas: 1 // jeden POD
  selector:
    matchLabels:
      app: nginx // ReplicaSet bedzie zarzadzal POD z etykiete app: nginx
  template:  // it will be used while POD createtion
    metadata:
      name: nginx
      labels:
        app: nginx
    spec:
      containers:
      - name: nginx
        image: nginx:1.12-alpine
        ports:
        - containerPort: 80
````

### Komendy

- kubctl apply -f REPLICASET_NAME.yaml // tworzenie obiektu REPLICASET na bazie pliku yaml
- kubectl get replicaset
- kubectl scale rs REPLICASET_NAME --replicas=NUMBER_OF_INSTANCES
- kubectl delete rx REPLICASET_NAME
- kubectl get rs
- kubectl autoscale rs REPLICASET_NAME --max=6 --cpu-percent=28  // zwieksz ilosc POD-ów do 6 jesli cpu zużycie dobije do 28%
- kubectl get hpa NAME_OBJECTSLAE // obiekt to autoscalowania




