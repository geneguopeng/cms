<%@ page import="cme.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="book.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${bookInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="book.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="price" value="${fieldValue(bean: bookInstance, field: 'price')}" required=""/>
</div>

