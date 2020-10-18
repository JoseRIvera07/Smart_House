#include "SoftwareSerial.h"

const int door1 = 16;      
const int door2 = 5;
const int door3 = 4;
const int door4 = 0;

const int room1 = 2;      
const int room2 = 14;
const int kitchen = 12;
const int dinnigRoom = 13;
const int livingRoom = 15;

int room1_flag = 0;
int room2_flag = 0;
int kitchen_flag = 0;
int dinnigRoom_flag = 0;
int livingRoom_flag = 0;


void setup() {
  Serial.begin(9600);
  pinMode(door1, OUTPUT);
  pinMode(door2, OUTPUT);
  pinMode(door3, OUTPUT);
  pinMode(door4, OUTPUT);
  pinMode(door1, OUTPUT);

  pinMode(room1, INPUT);
  pinMode(room2, INPUT);
  pinMode(kitchen, INPUT);
  pinMode(dinnigRoom, INPUT);
  pinMode(livingRoom, INPUT);

  Serial.println("SMART_HOUSE...");
}

void loop() {
  if ((digitalRead(room1) == HIGH) && (room1_flag == 0)) {
    Serial.println("Cuarto1 Luz ON");
    room1_flag = 1;
  }
  else if ((digitalRead(room1)) == LOW && (room1_flag == 1)) {
    Serial.println("Cuarto1 Luz OFF");
    room1_flag = 0;
  }
  //------------------------------------------------------

  if ((digitalRead(room2) == HIGH) && (room2_flag == 0)) {
    Serial.println("Cuarto2 Luz ON");
    room2_flag = 1;
  }
  else if ((digitalRead(room2) == LOW) && (room2_flag == 1)) {
    Serial.println("Cuarto2 Luz OFF");
    room2_flag = 0;
  }
  //------------------------------------------------------
  if ((digitalRead(kitchen) == HIGH) && (kitchen_flag == 0)) {
    Serial.println("Cocina Luz ON");
    kitchen_flag = 1;
  }
  else if ((digitalRead(kitchen) == LOW) && (kitchen_flag == 1)) {
    Serial.println("Cocina Luz OFF");
    kitchen_flag = 0;
  }
  //------------------------------------------------------
  if ((digitalRead(dinnigRoom) == HIGH) && (dinnigRoom_flag == 0)) {
    Serial.println("Comedor Luz ON");
    dinnigRoom_flag = 1;
  }
  else if ((digitalRead(dinnigRoom) == LOW) && (dinnigRoom_flag == 1)) {
    Serial.println("Comedor Luz OFF");
    dinnigRoom_flag = 0;
  }
  //------------------------------------------------------
  if ((digitalRead(livingRoom) == HIGH) && (livingRoom_flag == 0)) {
    Serial.println("Sala Luz ON");
    livingRoom_flag = 1;
  }
  else if ((digitalRead(livingRoom)) == LOW && (livingRoom_flag == 1)) {
    Serial.println("Sala Luz OFF");
    livingRoom_flag = 0;
  }

//-------------------------------------------------------------
  if(Serial.available() > 0 ){
    String str = Serial.readString();
    if (str.equals("door1_H")){
      Serial.println("Abriendo puerta #1");
      digitalWrite (door1, HIGH);
    }
    if (str.equals("door1_L")){
      Serial.println("Cerrando puerta #1");
      digitalWrite (door1, LOW);
    }
  
    if (str.equals("doorK_H")){
      Serial.println("Abriendo puerta ROOM2");
      digitalWrite (door2, HIGH);
    }
    if (str.equals("doorK_L")){
      Serial.println("Cerrando puerta ROOM1");
      digitalWrite (door2, LOW);
    }
  
    if (str.equals("doorD_H")){
      Serial.println("Abriendo puerta DINNIGROON");
      digitalWrite (door3, HIGH);
    }
    if (str.equals("doorD_L")){
      Serial.println("Cerrando puerta DINNIGROON");
      digitalWrite (door3, LOW);
    }
  
    if (str.equals("doorL_H")){
      Serial.println("Abriendo puerta LIVINGROON");
      digitalWrite (door4, HIGH);
    }
    if (str.equals("doorL_L")){
      Serial.println("Cerrando puerta LIVINGROON");
      digitalWrite (door4, LOW);
    }
  }

}
