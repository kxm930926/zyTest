package cn.com.zyTest

import cn.com.zyTest.entity.Chest

class OpenChestTest extends Chest {
    def "OpenChest"() {
        given: new Chest()
        expect: Chest.getField("code") ==1-10
        getCode() | hashCode| secretNumber
        1 |  0000079dda0cef8b640efd9d6a475fb179f29e52f9f0800f47f58d3998a20b15 |3229170
        2 |  000000102a4cb841e9c70ff7e5f04fb18f9b584258ce97c98189febcda579596 |1135497
        3 |  000002dcc19bc7c86528c625c9b5a11c066b76875cf344639dc50f807ac3dec3 |2125891
        4 |  00000efee702d3229f253e61154dbe4d152b276fcba9980ff7f841137608e3af |3041721
        5 |  0000007b54832063dbd8ca2bc6fa49774fc2d6388cfeeed6312e1459526819d0 |179272
        6 |  0000084b0b72e00f044ab399e1b8f1b2c9d3060e81d0d881b31b116334f6b484 |1295904
        7 |  00000b1061220e6c95d511c8b2b5a8206101b02fb8f96436c0c56d12c78348c9 |395138
        8 |  000007db8d6c79327c9e58348301312fa2f3e818348ab4bff39e25fe65254020 |1871275
    }
}
