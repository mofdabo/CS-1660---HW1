FROM openjdk:7
COPY . /Users/muhad/OneDrive/Desktop/HW1
WORKDIR /Users/muhad/OneDrive/Desktop/HW1
RUN javac GUI.java
CMD ["java", "GUI"]