package demo.filesaver

import org.scalajs.dom.raw.{Blob, BlobPropertyBag}
import org.scalatest.funsuite.AnyFunSuite
import vision.id.filesaver.facade.fileSaver.mod.saveAs

import scala.scalajs.js

class FileSaverComponentTest extends AnyFunSuite {
  test("Save a file") {
    val json = """{"key":"value}"""
    val blob = new Blob(js.Array(json), BlobPropertyBag(`type` = "text/json"))
    saveAs(blob, filename = "fileSaverTest.json")

    assert(true === true)
  }

}
