import * as React from "react"

export interface TdComponentProps {
  className?: string
}

const TdComponent: React.FC<TdComponentProps> = (props) => {
  const { className, children, ...restProps } = props
  return (
      <td {...restProps}> TdComponent </td>
  )
}

TdComponent.displayName = "TdComponent"
export default TdComponent
