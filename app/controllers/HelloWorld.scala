package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by ageorgin on 16/05/2016.
  */
class HelloWorld extends Controller {
  def index = Action {
    Ok("Hello the world")
  }
}
