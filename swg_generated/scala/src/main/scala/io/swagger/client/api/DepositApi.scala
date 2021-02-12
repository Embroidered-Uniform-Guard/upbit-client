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

import io.swagger.client.model.Deposit
import io.swagger.client.model.DepositCompleteResponse
import io.swagger.client.model.DepositTransferResponse
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

class DepositApi(
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
  val helper = new DepositApiAsyncHelper(client, config)

  /**
   * 개별 입금 주소 조회
   * ## 개별 입금 주소 조회  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
   *
   * @param currency Currency symbol  
   * @return DepositCompleteResponse
   */
  def depositCoinAddress(currency: String): Option[DepositCompleteResponse] = {
    val await = Try(Await.result(depositCoinAddressAsync(currency), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 개별 입금 주소 조회 asynchronously
   * ## 개별 입금 주소 조회  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
   *
   * @param currency Currency symbol  
   * @return Future(DepositCompleteResponse)
   */
  def depositCoinAddressAsync(currency: String): Future[DepositCompleteResponse] = {
      helper.depositCoinAddress(currency)
  }

  /**
   * 전체 입금 주소 조회
   * ## 내가 보유한 자산 리스트를 보여줍니다.  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
   *
   * @return Any
   */
  def depositCoinAddresses(): Option[Any] = {
    val await = Try(Await.result(depositCoinAddressesAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 전체 입금 주소 조회 asynchronously
   * ## 내가 보유한 자산 리스트를 보여줍니다.  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
   *
   * @return Future(Any)
   */
  def depositCoinAddressesAsync(): Future[Any] = {
      helper.depositCoinAddresses()
  }

  /**
   * 입금 주소 생성 요청
   * 입금 주소 생성을 요청한다.  **NOTE**: 입금 주소 생성 요청 API 유의사항  입금 주소의 생성은 서버에서 비동기적으로 이뤄집니다. 비동기적 생성 특성상 요청과 동시에 입금 주소가 발급되지 않을 수 있습니다. 주소 발급 요청 시 결과로 Response1이 반환되며 주소 발급 완료 이전까지 계속 Response1이 반환됩니다. 주소가 발급된 이후부터는 새로운 주소가 발급되는 것이 아닌 이전에 발급된 주소가 Response2 형태로 반환됩니다. 정상적으로 주소가 생성되지 않는다면 일정 시간 이후 해당 API를 다시 호출해주시길 부탁드립니다. 
   *
   * @param currency Currency 코드  
   * @return DepositCompleteResponse
   */
  def depositGenerateCoinAddress(currency: String): Option[DepositCompleteResponse] = {
    val await = Try(Await.result(depositGenerateCoinAddressAsync(currency), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 입금 주소 생성 요청 asynchronously
   * 입금 주소 생성을 요청한다.  **NOTE**: 입금 주소 생성 요청 API 유의사항  입금 주소의 생성은 서버에서 비동기적으로 이뤄집니다. 비동기적 생성 특성상 요청과 동시에 입금 주소가 발급되지 않을 수 있습니다. 주소 발급 요청 시 결과로 Response1이 반환되며 주소 발급 완료 이전까지 계속 Response1이 반환됩니다. 주소가 발급된 이후부터는 새로운 주소가 발급되는 것이 아닌 이전에 발급된 주소가 Response2 형태로 반환됩니다. 정상적으로 주소가 생성되지 않는다면 일정 시간 이후 해당 API를 다시 호출해주시길 부탁드립니다. 
   *
   * @param currency Currency 코드  
   * @return Future(DepositCompleteResponse)
   */
  def depositGenerateCoinAddressAsync(currency: String): Future[DepositCompleteResponse] = {
      helper.depositGenerateCoinAddress(currency)
  }

  /**
   * 개별 입금 조회
   * ## 개별 입금 조회 
   *
   * @param uuid 입금 UUID  (optional)
   * @param txid 입금 TXID  (optional)
   * @param currency Currency 코드  (optional)
   * @return Deposit
   */
  def depositInfo(uuid: Option[String] = None, txid: Option[String] = None, currency: Option[String] = None): Option[Deposit] = {
    val await = Try(Await.result(depositInfoAsync(uuid, txid, currency), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 개별 입금 조회 asynchronously
   * ## 개별 입금 조회 
   *
   * @param uuid 입금 UUID  (optional)
   * @param txid 입금 TXID  (optional)
   * @param currency Currency 코드  (optional)
   * @return Future(Deposit)
   */
  def depositInfoAsync(uuid: Option[String] = None, txid: Option[String] = None, currency: Option[String] = None): Future[Deposit] = {
      helper.depositInfo(uuid, txid, currency)
  }

  /**
   * 입금 리스트 조회
   * ## 입금 리스트 조회 
   *
   * @param currency Currency 코드  (optional)
   * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리완료 - almost_accepted : 입금 대기 중 - rejected : 거절 - accepted : 승인됨 - processing : 처리 중  (optional)
   * @param uuids 입금 UUID의 목록  (optional)
   * @param txids 입금 TXID의 목록  (optional)
   * @param limit 개수 제한 (default: 100, max: 100)  (optional)
   * @param page 페이지 수, default: 1  (optional)
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
   * @return List[Deposit]
   */
  def depositInfoAll(currency: Option[String] = None, state: Option[String] = None, uuids: Option[List[String]] = None, txids: Option[List[String]] = None, limit: Option[Number] = None, page: Option[Number] = None, orderBy: Option[String] = None): Option[List[Deposit]] = {
    val await = Try(Await.result(depositInfoAllAsync(currency, state, uuids, txids, limit, page, orderBy), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 입금 리스트 조회 asynchronously
   * ## 입금 리스트 조회 
   *
   * @param currency Currency 코드  (optional)
   * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리완료 - almost_accepted : 입금 대기 중 - rejected : 거절 - accepted : 승인됨 - processing : 처리 중  (optional)
   * @param uuids 입금 UUID의 목록  (optional)
   * @param txids 입금 TXID의 목록  (optional)
   * @param limit 개수 제한 (default: 100, max: 100)  (optional)
   * @param page 페이지 수, default: 1  (optional)
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
   * @return Future(List[Deposit])
   */
  def depositInfoAllAsync(currency: Option[String] = None, state: Option[String] = None, uuids: Option[List[String]] = None, txids: Option[List[String]] = None, limit: Option[Number] = None, page: Option[Number] = None, orderBy: Option[String] = None): Future[List[Deposit]] = {
      helper.depositInfoAll(currency, state, uuids, txids, limit, page, orderBy)
  }

}

class DepositApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def depositCoinAddress(currency: String)(implicit reader: ClientResponseReader[DepositCompleteResponse]): Future[DepositCompleteResponse] = {
    // create path and map variables
    val path = (addFmt("/deposits/coin_address"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency == null) throw new Exception("Missing required parameter 'currency' when calling DepositApi->depositCoinAddress")

    queryParams += "currency" -> currency.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def depositCoinAddresses()(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/deposits/coin_addresses"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def depositGenerateCoinAddress(currency: String)(implicit reader: ClientResponseReader[DepositCompleteResponse]): Future[DepositCompleteResponse] = {
    // create path and map variables
    val path = (addFmt("/deposits/generate_coin_address"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency == null) throw new Exception("Missing required parameter 'currency' when calling DepositApi->depositGenerateCoinAddress")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def depositInfo(uuid: Option[String] = None,
    txid: Option[String] = None,
    currency: Option[String] = None
    )(implicit reader: ClientResponseReader[Deposit]): Future[Deposit] = {
    // create path and map variables
    val path = (addFmt("/deposit"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    uuid match {
      case Some(param) => queryParams += "uuid" -> param.toString
      case _ => queryParams
    }
    txid match {
      case Some(param) => queryParams += "txid" -> param.toString
      case _ => queryParams
    }
    currency match {
      case Some(param) => queryParams += "currency" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def depositInfoAll(currency: Option[String] = None,
    state: Option[String] = None,
    uuids: Option[List[String]] = None,
    txids: Option[List[String]] = None,
    limit: Option[Number] = None,
    page: Option[Number] = None,
    orderBy: Option[String] = None
    )(implicit reader: ClientResponseReader[List[Deposit]]): Future[List[Deposit]] = {
    // create path and map variables
    val path = (addFmt("/deposits"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    currency match {
      case Some(param) => queryParams += "currency" -> param.toString
      case _ => queryParams
    }
    state match {
      case Some(param) => queryParams += "state" -> param.toString
      case _ => queryParams
    }
    uuids match {
      case Some(param) => queryParams += "uuids" -> param.toString
      case _ => queryParams
    }
    txids match {
      case Some(param) => queryParams += "txids" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    orderBy match {
      case Some(param) => queryParams += "order_by" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
