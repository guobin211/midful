class Person {
  constructor(name) {
    this.name = name;
    this.creatAt = new Date().toUTCString();
  }
  introduce() {
    console.log(`hello I'm ${this.name}`);
  }
}

const jack = new Person('jack')
const tom = new Person('tom')

// undefined
jack.introduce.apply(this)
// node name
this.name = 'node name'
jack.introduce.apply(this)
// tom
jack.introduce.apply(tom)
