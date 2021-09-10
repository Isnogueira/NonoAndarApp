<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<div class="form-group">
	<label for="cep" class="text-info">CEP</label><br> <input
		type="text" name="cep" id="cep" value="${meuEndereco.cep}" class="form-control">
</div>
<div class="form-group">
	<label for="logr" class="text-info">Logradouro</label><br> <input
		type="text" name="logradouro" id="logr" value="${meuEndereco.logradouro}" class="form-control">
</div>
<div class="form-group">
	<label for="compl" class="text-info">Complemento</label><br> <input
		type="text" name="complemento" value="${meuEndereco.complemento}" id="compl"
		class="form-control">
</div>
<div class="form-group">
	<label for="bairro" class="text-info">Bairro</label><br> <input
		type="text" name="bairro" id="bairro" value="${meuEndereco.bairro}" class="form-control">
</div>
<div class="form-group">
	<label for="local" class="text-info">Localidade</label><br> <input
		type="text" name="localidade" id="local" value="${meuEndereco.localidade}" class="form-control">
</div>
<div class="form-group">
	<label for="uf" class="text-info">UF</label><br> <input
		type="text" name="uf" id="uf" value="${meuEndereco.uf}" class="form-control">
</div>

