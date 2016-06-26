package controllers

import org.sample.models.Contact
import converters.ContactJson.contactReader
import play.api.mvc.{Action, Controller}
import play.api.libs.json.{JsObject, JsSuccess}
import play.api.Logger

class Contacts extends Controller {
	val logger = Logger(this.getClass)

	def update(id: Long) = Action(parse.json) { implicit request =>
		val js = request.body

		logger.info("hello world")

		logger.info(js.asInstanceOf[JsObject].keys.mkString(","))

		Ok
	}
}
