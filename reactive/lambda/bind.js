const car = {
  speed: 60,
  run: function (name) {
    console.log(`${name}速度${this.speed}`);
  }
}

const rocket = {
  speed: 1200
}

const runRefs = car.run
// bind(this, ...args)
const rocketRunFn = runRefs.bind(rocket)
rocketRunFn('rocket')