<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Recherche...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
			<c:url value="/home/" var="home"/>
			<li><a href="${home}"><i class="fa fa-dashboard fa-fw"></i>
					<fmt:message key="common.dashbord"/></a></li>
			<c:url value="/article/" var="article"/>
			<li><a href="${article}"><i class="fa fa-dashboard fa-fw"></i>
					<fmt:message key="common.article"/></a></li>
			
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
					<fmt:message key="common.client"/><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<c:url value="/client/" var="client"/>
					<li><a href="${client}"><fmt:message key="common.client"/> </a></li>
					<c:url value="/commandeClient/" var="cdeClient" />
					<li><a href="${cdeClient}"><fmt:message key="commun.client.commande"/></a></li>
				</ul> <!-- /.nav-second-level -->
			</li>
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
					<fmt:message key="commun.fournisseur"/><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<c:url value="/fournisseur/" var="fournisseur" />
					<li><a href="${fournisseur}"><fmt:message key="commun.fournisseur"/> </a></li>
					<c:url value="/commandeFournisseur/" var="cdeFournisseur"/>
					<li><a href="${cdeFournisseur}"><fmt:message key="commun.fournisseur.commande"/></a></li>
				</ul> <!-- /.nav-second-level -->
			</li>
			<c:url value="/stock/" var="stock"/>
			<li><a href="${stock}"><i class="fa fa-table fa-fw"></i>
					<fmt:message key="commun.stock"/></a></li>
			<c:url value="/vente/" var="vente"/>
			<li><a href="${vente}"><i class="fa fa-edit fa-fw""></i>
					<fmt:message key="commun.vente"/></a></li>
			<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
					<fmt:message key="commun.parametrage"/><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<c:url value="utilisateur" var="user"/>
					<li><a href="${user}"><fmt:message key="commun.parametrage.utilisateur"/> </a></li>
					<c:url value="categorie" var="categorie"/>
					<li><a href="${categorie}"><fmt:message key="commun.parametrage.categorie"/></a></li>
				</ul> <!-- /.nav-second-level -->
			</li>

		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>