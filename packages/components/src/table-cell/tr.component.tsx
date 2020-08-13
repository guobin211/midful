import * as React from "react"

export interface TrComponentProps {
  className?: string
}

const TrComponent: React.FC<TrComponentProps> = (props) => {
  const { className, children, ...restProps } = props
  return (
      <tr {...restProps}> TrComponent </tr>
  )
}

TrComponent.displayName = "TrComponent"
export default TrComponent
