import jenkins.model.*
def instance = Jenkins.get()
instance.setSecurityRealm(null)
instance.setAuthorizationStrategy(null)
instance.save()
