package com.example.shayariapp.Model

class ShayariModal {

    var id = 0
    var cate = 0
    var sms: String

    constructor(id: Int, cate: Int,sms: String) {
        this.id = id
        this.cate = cate
        this.sms = sms
    }
}