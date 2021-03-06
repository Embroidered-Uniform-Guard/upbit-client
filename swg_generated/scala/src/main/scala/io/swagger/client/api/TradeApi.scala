/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Error
import io.swagger.client.model.Number
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class TradeApi(
  val defBasePath: String = "https://api.upbit.com/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new TradeApiAsyncHelper(client, config)

  /**
   * 시세 Ticker 조회
   * ## 현재가 정보 요청 당시 종목의 스냅샷을 반환한다. 
   *
   * @param markets 반점으로 구분되는 마켓 코드 (ex. KRW-BTC, BTC-BCC)  
   * @return Any
   */
  def tradeTicker(markets: String): Option[Any] = {
    val await = Try(Await.result(tradeTickerAsync(markets), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 시세 Ticker 조회 asynchronously
   * ## 현재가 정보 요청 당시 종목의 스냅샷을 반환한다. 
   *
   * @param markets 반점으로 구분되는 마켓 코드 (ex. KRW-BTC, BTC-BCC)  
   * @return Future(Any)
   */
  def tradeTickerAsync(markets: String): Future[Any] = {
      helper.tradeTicker(markets)
  }

  /**
   * 시세 체결 조회
   * ## 최근 체결 내역 
   *
   * @param market 마켓 코드 (ex. KRW-BTC, BTC-BCC)  
   * @param to 마지막 체결 시각. 형식 : &#x60;[HHmmss 또는 HH:mm:ss]&#x60;. 비워서 요청시 가장 최근 데이터  (optional)
   * @param count 체결 개수  (optional)
   * @param cursor 페이지네이션 커서 (sequentialId)  &#x60;sequential_id&#x60; 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다.  (optional)
   * @param daysAgo 최근 체결 날짜 기준 7일 이내의 이전 데이터 조회 가능. 비워서 요청 시 가장 최근 체결 날짜 반환. (범위: 1 ~ 7)  (optional)
   * @return Any
   */
  def tradeTicks(market: String, to: Option[String] = None, count: Option[Number] = None, cursor: Option[String] = None, daysAgo: Option[Number] = None): Option[Any] = {
    val await = Try(Await.result(tradeTicksAsync(market, to, count, cursor, daysAgo), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 시세 체결 조회 asynchronously
   * ## 최근 체결 내역 
   *
   * @param market 마켓 코드 (ex. KRW-BTC, BTC-BCC)  
   * @param to 마지막 체결 시각. 형식 : &#x60;[HHmmss 또는 HH:mm:ss]&#x60;. 비워서 요청시 가장 최근 데이터  (optional)
   * @param count 체결 개수  (optional)
   * @param cursor 페이지네이션 커서 (sequentialId)  &#x60;sequential_id&#x60; 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다.  (optional)
   * @param daysAgo 최근 체결 날짜 기준 7일 이내의 이전 데이터 조회 가능. 비워서 요청 시 가장 최근 체결 날짜 반환. (범위: 1 ~ 7)  (optional)
   * @return Future(Any)
   */
  def tradeTicksAsync(market: String, to: Option[String] = None, count: Option[Number] = None, cursor: Option[String] = None, daysAgo: Option[Number] = None): Future[Any] = {
      helper.tradeTicks(market, to, count, cursor, daysAgo)
  }

}

class TradeApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def tradeTicker(markets: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/ticker"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (markets == null) throw new Exception("Missing required parameter 'markets' when calling TradeApi->tradeTicker")

    queryParams += "markets" -> markets.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def tradeTicks(market: String,
    to: Option[String] = None,
    count: Option[Number] = None,
    cursor: Option[String] = None,
    daysAgo: Option[Number] = None
    )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/trades/ticks"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (market == null) throw new Exception("Missing required parameter 'market' when calling TradeApi->tradeTicks")

    queryParams += "market" -> market.toString
    to match {
      case Some(param) => queryParams += "to" -> param.toString
      case _ => queryParams
    }
    count match {
      case Some(param) => queryParams += "count" -> param.toString
      case _ => queryParams
    }
    cursor match {
      case Some(param) => queryParams += "cursor" -> param.toString
      case _ => queryParams
    }
    daysAgo match {
      case Some(param) => queryParams += "daysAgo" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
