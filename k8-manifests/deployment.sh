#!/bin/bash

echo "Creating secrets.."
kubectl apply -f secrets.yml

echo "Creating config map.."
kubectl apply -f config-map.yml

echo "Deploying Redis Cache..."
kubectl apply -f redis.yml

echo "Deploying Mongo DB..."
kubectl apply -f mongodb.yml

echo "Deploying Mysql..."
kubectl apply -f mysql.yml

echo "Deploying Zookeeper..."
kubectl apply -f zookeeper.yml

echo "Deploying Kafka..."
kubectl apply -f kafka.yml

echo "Deploying Configuration Service..."
kubectl apply -f configuration-service.yml

echo "Deploying Service Registry..."
kubectl apply -f service-registry.yml

echo "Deploying Api Gateway Service..."
kubectl apply -f api-gateway-service.yml

echo "Deploying User Service..."
kubectl apply -f user-service.yml

echo "Deploying Order Service..."
kubectl apply -f order-service.yml

echo "Deploying Product Service..."
kubectl apply -f product-service.yml