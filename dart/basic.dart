class Basic {
  var names = ["mad", "kazuya", "akari", "jirou", "mizuhara"];

  void pn() {
    for (var name in names) {
      print(name);
    }
  }
}

void main() {
  var bs = new Basic();

  bs.pn();
}
