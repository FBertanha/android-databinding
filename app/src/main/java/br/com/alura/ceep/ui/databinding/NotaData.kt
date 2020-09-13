package br.com.alura.ceep.ui.databinding

import androidx.databinding.ObservableField
import br.com.alura.ceep.model.Nota

/**
 * Created by felipebertanha on 12/September/2020
 */
class NotaData(
    private var nota: Nota = Nota(),
    val titulo: ObservableField<String> = ObservableField(nota.titulo),
    val descricao: ObservableField<String> = ObservableField(nota.descricao),
    val favorita: ObservableField<Boolean> = ObservableField(nota.favorita),
    val imagemUrl: ObservableField<String> = ObservableField(nota.imagemUrl)
) {
    fun atualiza(nota: Nota) {
        this.nota = nota
        this.titulo.set(this.nota.titulo)
        this.descricao.set(this.nota.descricao)
        this.favorita.set(this.nota.favorita)
        this.imagemUrl.set(this.nota.imagemUrl)
    }

    fun paraNota(): Nota? {
        return this.nota.copy(
            titulo = titulo.get() ?: return null,
            descricao = descricao.get() ?: return null,
            favorita = favorita.get() ?: false,
            imagemUrl = imagemUrl.get() ?: return null
        )
    }
}