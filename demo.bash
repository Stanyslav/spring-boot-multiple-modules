#!/usr/bin/env bash

rm -Rf demo/*
mvn clean package > /dev/null

mkdir -p demo/{libs,modules}
cp migrate/target/*.jar demo/modules/
cp app/target/*.jar demo/
cp app/target/dependency/*.jar demo/libs/
cp -r config demo/

java -cp demo/'*':demo/libs/'*':demo/modules/'*' ru.example.app.MultimoduleApplication
echo '---------------------'
java -cp demo/'*':demo/libs/'*':demo/modules/'*' -Dspring.profiles.active=banner ru.example.app.MultimoduleApplication