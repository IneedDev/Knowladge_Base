A deployment is an object in Kubernetes that lets you manage a set of identical pods.

A deployment is responsible for keeping a set of pods running.

A service is responsible for enabling network access to a set of pods.

A Pod (as in a pod of whales or pea pod) is a group of one or more containers (such as Docker containers). Containers within a Pod share an IP address and port space, and can find each other via localhost.
Applications within a Pod also have access to shared volumes, which are defined as part of a Pod and are made available to be mounted into each application’s filesystem.

Service - define logical set of PODS