package aula_26_interfaces

data class Document(val text: String)

interface Printer {
    fun print(text: String): Document

    val printerType : String
}

interface TextConverter {
    val defaultText: String
        get() = "Desconhecido"

    fun convert(text: String, printerType: String): String {
        return text.ifEmpty { defaultText }
    }
}

class PdfPrinter: Printer, TextConverter {
    override fun print(text: String): Document {
        convert(text = text, printerType = printerType)
        println("PDF printing: ${text}")
        return Document(text = text)
    }

    override val printerType: String
        get() = "PDF"

    override fun convert(text: String, printerType: String): String {
        println("Convertendo texto '$text' para o tipo $printerType")
        return text
    }

}

fun main() {
    val pdfPrinter = PdfPrinter()
    val pdfPrint: Document = pdfPrinter.print(text = "Hello kotlin")

    pdfPrinter.print(text = "Arquivo para traducao")
    println(pdfPrint.text)
}