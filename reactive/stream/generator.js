const point = 0;

function* pipe(n) {
  while (point < n) {
    yield n;
    n--;
  }
}

const iter = pipe(5)

while (true) {
  const res = iter.next();
  if (res.done) {
    return;
  }
  console.log(res.value);
}
