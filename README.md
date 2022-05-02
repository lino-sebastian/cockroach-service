# cockroach-service
Sample Spring boot app interacting with [Cockroach DB](https://www.cockroachlabs.com/)

## Cockroach DB
[CockroachDB](https://www.cockroachlabs.com/) is designed to survive software and hardware failures, from server restarts to datacenter outages.
This is accomplished without confusing artifacts typical of other distributed systems (e.g., stale reads) using strongly-consistent replication as well 
as automated repair after failures.

CockroachDB is a SQL database for building global cloud services. It falls under the category of NewSQL – a relational database that can scale horizontally.
CockroachDB core is free to use. Most core features are licensed under the BSL, but some core features are subject to the CCL or third-party licenses.

Founded by ex-Googlers in 2015, CockroachDB has been described as nearly impossible to take down, hence its name — cockroaches are renowned for their resilience. 
With CockroachDB, companies can store multiple copies of their data in different locations to ensure uninterrupted access.

## Pre-requisites
- Deploy cockroach DB on a single [Kubernetes cluster](https://www.cockroachlabs.com/docs/v21.2/deploy-cockroachdb-with-kubernetes)
- docker

## Steps to Run
1. Login to the respective Kubernetes cluster
2. Port forward the cockroach-db to your local machine
3. Create appropriate **Database** and **Tables**
4. Replace the Database and table name in ```application.properties```
5. Create appropriate model class based on the Table created
6. Build the application ```mvn clean install```
7. Build the docker image by running ```docker build -t your_image_name .``` right in Dockerfile location
8. Replace the docker image name in ```deployment.yaml``` with your image name
9. Run ```kubectl apply -f deployment.yaml``` on cluster


