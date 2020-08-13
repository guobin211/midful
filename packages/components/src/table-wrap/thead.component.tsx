import * as React from "react"

export interface TheadComponentProps {
  className?: string
}

const TheadComponent: React.FC<TheadComponentProps> = (props) => {
  const { className, children, ...restProps } = props
  return (
      <div {...restProps}> TheadComponent </div>
  )
}

TheadComponent.displayName = "TheadComponent"
export default TheadComponent
