# Sysguineki Android

Projeto Android inicial que pode ser compilado no GitHub Actions.

## Como usar
1. Envie todos os ficheiros e pastas deste projeto para a raiz do repositório GitHub.
2. Abra o separador **Actions**.
3. Escolha **Build Sysguineki APK** e execute **Run workflow**, ou aguarde a compilação automática após o envio.
4. Quando terminar, abra a execução e descarregue o artefacto `Sysguineki-debug-apk`.

## Importante
Este APK é apenas uma aplicação Android inicial (WebView). Para funcionar online, primeiro é necessário publicar o servidor Sysguineki e substituir `https://SEU-DOMINIO-AQUI` em `MainActivity.kt` pelo endereço HTTPS real do servidor. O projeto backend/MVP é separado deste projeto Android.
