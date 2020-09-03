package br.com.alura.ceep.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.alura.ceep.ui.extensions.carregaImagem

/**
 * Created by felipebertanha on 30/August/2020
 */


@BindingAdapter("carregarImagemUrl")
fun ImageView.carregarImagemUrl(url: String?) {
    url?.let { carregaImagem(url)}
}