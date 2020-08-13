interface MessageData<T> {
  type: string
  body: T
}

(() => {
  let original
  self.onmessage = (ev) => {
    original = ev.original
    try {

      const data: number[] = JSON.parse(ev.data)
      if (Array.isArray(data)) {
        const res = data.sort()
        postMessage({ type: "workersuccess", body: res }, original)
      } else {
        postMessage({ type: "worker.type.error", body: "data not array" }, original)
      }
    } catch (error) {
      postMessage({ type: "onmessage.JSON.parse(ev.data)", body: error }, original)
    }

  }
  self.onerror = (error) => {
    postMessage({ type: "onerror", body: error }, original)
  }
  self.onmessageerror = (error) => {
    postMessage({ type: "onmessageerror", body: error }, original)
  }

  function postMessage<T>(data: MessageData<T>, original = "") {
    self.postMessage(JSON.stringify(data), original)
  }
})()
