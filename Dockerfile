FROM openjdk:19
RUN mkdir /lab
COPY . /lab
WORKDIR /lab
CMD javac Factorial.java;java Factorial