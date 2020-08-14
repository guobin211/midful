const fs = require("fs")
const path = require("path")

const packages = path.resolve(__dirname, "..", "packages")
const dirs = fs.readdirSync(packages)

const projects = []

dirs.forEach(v => {
  const project = path.resolve(packages, v)
  const json = path.resolve(project, "package.json")
  const pack = require(json)
  projects.push({
    dir: project,
    name: pack.name || v,
    version: pack.version || ""
  })
})

console.log(projects)
