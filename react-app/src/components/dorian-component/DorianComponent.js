import React, { Component } from "react";
import { Link } from "react-router-dom";
import { withRouter } from "react-router";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import "./DorianComponent.scss";
require("../../utils/Icons");


class DorianComponent extends Component {
  render() {
      return (
          <div className="test-component">
              This is <span>{this.props.test}</span> test component
          </div>
      );
  }
}

export default withRouter(DorianComponent);
