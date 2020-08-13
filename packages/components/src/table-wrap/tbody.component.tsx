import * as React from "react"

export interface TbodyComponentProps {
  className?: string
}

const TbodyComponent: React.FC<TbodyComponentProps> = (props) => {
  const { className, children, ...restProps } = props
  return (
      <div {...restProps}> TbodyComponent </div>
  )
}

TbodyComponent.displayName = "TbodyComponent"
export default TbodyComponent
