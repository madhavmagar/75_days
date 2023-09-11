import 'dart:io';

void main() {
  var m = new Mobile();

  m.color = "Red";
  m.brand = "BMW";
  m.model = "10";

  print(m.calling());
  print(m.brand);
  stdout.write(m.color);
  print(m.model);
  print(m.music());
  print(m.photo());
}

class Mobile {
  String? color, model, brand;

  String calling() {
    return "Can call.";
  }

  String music() {
    return "Can play music.";
  }

  String photo() {
    return "Cat take photos.";
  }
}
