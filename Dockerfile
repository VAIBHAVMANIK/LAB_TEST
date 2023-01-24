FROM openjdk:19
RUN mkdir /test
COPY . /test
WORKDIR /test
CMD javac Factorial.java;java Factorial
