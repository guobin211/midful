class Car {
  constructor(color) {
    this.color = color
  }
  disply(car, name) {
    console.log(car)
    console.log(name)
    console.log(this.color)
  }
}

const ae86 = new Car('白色')
ae86.disply(ae86, 'ae86')

const e3 = new Car('黑色')
// call(this, ...args)
ae86.disply.call(e3, ae86, 'e3')
// apply(this, [...args])
ae86.disply.apply(e3, [ae86, 'e3'])
