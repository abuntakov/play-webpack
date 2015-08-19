package controllers

import org.sample.models.Contact
import converters.ContactJson.contactReader
import play.api.mvc.{Action, Controller}
import play.api.libs.json.JsSuccess
import play.api.Logger

object Contacts extends Controller {
  val logger = Logger(this.getClass)

  def update(id: Long) = Action(parse.json) { implicit request => 
    request.body.validate[Contact] match {
      case JsSuccess(contact, _) =>
        logger.info(s"contact: $contact")
        Ok("Success")

      case _ =>
        Ok("Error")
    }
  }
}