import 'dart:io';

class Basic {
  var names = ["mad", "kazuya", "akari", "jirou", "mizuhara"];

  void pn() {
    for (var name in names) {
      print(name);
    }
  }
}

void main() {
  // print("hello world!");

  // // int? num;

  // // assert(num == null);

  // // num = 2000;
  // var num = stdin.readLineSync();

  // stdout.write("$num \n");
  // int? s = int.parse(num!);
  // stdout.write(s.runtimeType);

  var bs = new Basic();

  bs.pn();
}
