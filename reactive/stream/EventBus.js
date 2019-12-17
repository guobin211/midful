function EventBus() {
  this.observerList = [];
  this.addObserver = observer => {
    if (observer.notify && typeof observer.notify === "function") {
      if (this.observerList.indexOf(observer) === -1) {
        this.observerList.push(observer);
      }
    } else {
      throw new TypeError("addObserver must impl notify method");
    }
  };

  this.removeObserver = observer => {
    for (let i = 0; i < this.observerList.length; i++) {
      if (this.observerList[i] === observer) {
        this.observerList.splice(i, 1);
      }
    }
  };

  this.publish = message => {
    for (const observer of this.observerList) {
      observer.notify(message);
    }
  };

  this.clear = params => {
    this.observerList = [];
  };
}

function Observer(id, data) {
  this.id = id;
  this.data = data;
  this.notify = message => {
    console.log(`vue收到消息: ${message}`);
    this.data = message;
    this.render();
  };
  this.render = () => {
    console.log(`<div>${this.data}</div>`);
  };
}

let i = 1;
const eventBus = new EventBus();
setInterval(() => {
  eventBus.publish(`vue-app-${i++}`);
}, 2000);

const app = new Observer(1, "vue-app-0");
app.render();
eventBus.addObserver(app);

