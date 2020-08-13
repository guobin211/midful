import * as React from "react"

export interface TableComponentProps {
  className?: string
}

const TableComponent: React.FC<TableComponentProps> = (props) => {
  const { className, children, ...restProps } = props
  return (
      <table {...restProps}> TableComponent </table>
  )
}

TableComponent.displayName = "TableComponent"
export default TableComponent
