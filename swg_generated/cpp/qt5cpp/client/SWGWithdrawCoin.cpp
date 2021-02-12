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


#include "SWGWithdrawCoin.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGWithdrawCoin::SWGWithdrawCoin(QString json) {
    init();
    this->fromJson(json);
}

SWGWithdrawCoin::SWGWithdrawCoin() {
    init();
}

SWGWithdrawCoin::~SWGWithdrawCoin() {
    this->cleanup();
}

void
SWGWithdrawCoin::init() {
    type = new QString("");
    m_type_isSet = false;
    uuid = new QString("");
    m_uuid_isSet = false;
    currency = new QString("");
    m_currency_isSet = false;
    txid = new QString("");
    m_txid_isSet = false;
    state = new QString("");
    m_state_isSet = false;
    created_at = new QString("");
    m_created_at_isSet = false;
    done_at = new QString("");
    m_done_at_isSet = false;
    amount = new QString("");
    m_amount_isSet = false;
    fee = new QString("");
    m_fee_isSet = false;
    krw_amount = new QString("");
    m_krw_amount_isSet = false;
    transaction_type = new QString("");
    m_transaction_type_isSet = false;
}

void
SWGWithdrawCoin::cleanup() {
    if(type != nullptr) { 
        delete type;
    }
    if(uuid != nullptr) { 
        delete uuid;
    }
    if(currency != nullptr) { 
        delete currency;
    }
    if(txid != nullptr) { 
        delete txid;
    }
    if(state != nullptr) { 
        delete state;
    }
    if(created_at != nullptr) { 
        delete created_at;
    }
    if(done_at != nullptr) { 
        delete done_at;
    }
    if(amount != nullptr) { 
        delete amount;
    }
    if(fee != nullptr) { 
        delete fee;
    }
    if(krw_amount != nullptr) { 
        delete krw_amount;
    }
    if(transaction_type != nullptr) { 
        delete transaction_type;
    }
}

SWGWithdrawCoin*
SWGWithdrawCoin::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWithdrawCoin::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&type, pJson["type"], "QString", "QString");
    
    ::Swagger::setValue(&uuid, pJson["uuid"], "QString", "QString");
    
    ::Swagger::setValue(&currency, pJson["currency"], "QString", "QString");
    
    ::Swagger::setValue(&txid, pJson["txid"], "QString", "QString");
    
    ::Swagger::setValue(&state, pJson["state"], "QString", "QString");
    
    ::Swagger::setValue(&created_at, pJson["created_at"], "QString", "QString");
    
    ::Swagger::setValue(&done_at, pJson["done_at"], "QString", "QString");
    
    ::Swagger::setValue(&amount, pJson["amount"], "QString", "QString");
    
    ::Swagger::setValue(&fee, pJson["fee"], "QString", "QString");
    
    ::Swagger::setValue(&krw_amount, pJson["krw_amount"], "QString", "QString");
    
    ::Swagger::setValue(&transaction_type, pJson["transaction_type"], "QString", "QString");
    
}

QString
SWGWithdrawCoin::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGWithdrawCoin::asJsonObject() {
    QJsonObject obj;
    if(type != nullptr && *type != QString("")){
        toJsonValue(QString("type"), type, obj, QString("QString"));
    }
    if(uuid != nullptr && *uuid != QString("")){
        toJsonValue(QString("uuid"), uuid, obj, QString("QString"));
    }
    if(currency != nullptr && *currency != QString("")){
        toJsonValue(QString("currency"), currency, obj, QString("QString"));
    }
    if(txid != nullptr && *txid != QString("")){
        toJsonValue(QString("txid"), txid, obj, QString("QString"));
    }
    if(state != nullptr && *state != QString("")){
        toJsonValue(QString("state"), state, obj, QString("QString"));
    }
    if(created_at != nullptr && *created_at != QString("")){
        toJsonValue(QString("created_at"), created_at, obj, QString("QString"));
    }
    if(done_at != nullptr && *done_at != QString("")){
        toJsonValue(QString("done_at"), done_at, obj, QString("QString"));
    }
    if(amount != nullptr && *amount != QString("")){
        toJsonValue(QString("amount"), amount, obj, QString("QString"));
    }
    if(fee != nullptr && *fee != QString("")){
        toJsonValue(QString("fee"), fee, obj, QString("QString"));
    }
    if(krw_amount != nullptr && *krw_amount != QString("")){
        toJsonValue(QString("krw_amount"), krw_amount, obj, QString("QString"));
    }
    if(transaction_type != nullptr && *transaction_type != QString("")){
        toJsonValue(QString("transaction_type"), transaction_type, obj, QString("QString"));
    }

    return obj;
}

QString*
SWGWithdrawCoin::getType() {
    return type;
}
void
SWGWithdrawCoin::setType(QString* type) {
    this->type = type;
    this->m_type_isSet = true;
}

QString*
SWGWithdrawCoin::getUuid() {
    return uuid;
}
void
SWGWithdrawCoin::setUuid(QString* uuid) {
    this->uuid = uuid;
    this->m_uuid_isSet = true;
}

QString*
SWGWithdrawCoin::getCurrency() {
    return currency;
}
void
SWGWithdrawCoin::setCurrency(QString* currency) {
    this->currency = currency;
    this->m_currency_isSet = true;
}

QString*
SWGWithdrawCoin::getTxid() {
    return txid;
}
void
SWGWithdrawCoin::setTxid(QString* txid) {
    this->txid = txid;
    this->m_txid_isSet = true;
}

QString*
SWGWithdrawCoin::getState() {
    return state;
}
void
SWGWithdrawCoin::setState(QString* state) {
    this->state = state;
    this->m_state_isSet = true;
}

QString*
SWGWithdrawCoin::getCreatedAt() {
    return created_at;
}
void
SWGWithdrawCoin::setCreatedAt(QString* created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

QString*
SWGWithdrawCoin::getDoneAt() {
    return done_at;
}
void
SWGWithdrawCoin::setDoneAt(QString* done_at) {
    this->done_at = done_at;
    this->m_done_at_isSet = true;
}

QString*
SWGWithdrawCoin::getAmount() {
    return amount;
}
void
SWGWithdrawCoin::setAmount(QString* amount) {
    this->amount = amount;
    this->m_amount_isSet = true;
}

QString*
SWGWithdrawCoin::getFee() {
    return fee;
}
void
SWGWithdrawCoin::setFee(QString* fee) {
    this->fee = fee;
    this->m_fee_isSet = true;
}

QString*
SWGWithdrawCoin::getKrwAmount() {
    return krw_amount;
}
void
SWGWithdrawCoin::setKrwAmount(QString* krw_amount) {
    this->krw_amount = krw_amount;
    this->m_krw_amount_isSet = true;
}

QString*
SWGWithdrawCoin::getTransactionType() {
    return transaction_type;
}
void
SWGWithdrawCoin::setTransactionType(QString* transaction_type) {
    this->transaction_type = transaction_type;
    this->m_transaction_type_isSet = true;
}


bool
SWGWithdrawCoin::isSet(){
    bool isObjectUpdated = false;
    do{
        if(type != nullptr && *type != QString("")){ isObjectUpdated = true; break;}
        if(uuid != nullptr && *uuid != QString("")){ isObjectUpdated = true; break;}
        if(currency != nullptr && *currency != QString("")){ isObjectUpdated = true; break;}
        if(txid != nullptr && *txid != QString("")){ isObjectUpdated = true; break;}
        if(state != nullptr && *state != QString("")){ isObjectUpdated = true; break;}
        if(created_at != nullptr && *created_at != QString("")){ isObjectUpdated = true; break;}
        if(done_at != nullptr && *done_at != QString("")){ isObjectUpdated = true; break;}
        if(amount != nullptr && *amount != QString("")){ isObjectUpdated = true; break;}
        if(fee != nullptr && *fee != QString("")){ isObjectUpdated = true; break;}
        if(krw_amount != nullptr && *krw_amount != QString("")){ isObjectUpdated = true; break;}
        if(transaction_type != nullptr && *transaction_type != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

