import * as React from "react"

export interface ThComponentProps {
  className?: string
}

const ThComponent: React.FC<ThComponentProps> = (props) => {
  const { className, children, ...restProps } = props
  return (
      <th {...restProps}> ThComponent </th>
  )
}

ThComponent.displayName = "ThComponent"
export default ThComponent
