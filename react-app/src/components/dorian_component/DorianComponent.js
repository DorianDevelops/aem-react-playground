import React, { Component } from "react";
import { MapTo } from "@adobe/cq-react-editable-components";

import "./DorianComponent.scss";

export default class DorianComponent extends Component {
  render() {
    return (
      <div className="test-component">
        <h1>Hello world</h1>
        {this.props.testText}
      </div>
    );
  }
}

MapTo("wknd-events/components/content/dorian_component")(DorianComponent);
