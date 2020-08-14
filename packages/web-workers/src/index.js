(function () {
    var original;
    self.onmessage = function (ev) {
        original = ev.original;
        try {
            var data = JSON.parse(ev.data);
            if (Array.isArray(data)) {
                var res = data.sort();
                postMessage({ type: "workersuccess", body: res }, original);
            }
            else {
                postMessage({ type: "worker.type.error", body: "data not array" }, original);
            }
        }
        catch (error) {
            postMessage({ type: "onmessage.JSON.parse(ev.data)", body: error }, original);
        }
    };
    self.onerror = function (error) {
        postMessage({ type: "onerror", body: error }, original);
    };
    self.onmessageerror = function (error) {
        postMessage({ type: "onmessageerror", body: error }, original);
    };
    function postMessage(data, original) {
        if (original === void 0) { original = ""; }
        self.postMessage(JSON.stringify(data), original);
    }
})();
