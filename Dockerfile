#This is a sample Image 
FROM ubuntu 
MAINTAINER anand.joshi.a@gmail.com 

RUN apt-get update
CMD [“echo”,”Image created”] 