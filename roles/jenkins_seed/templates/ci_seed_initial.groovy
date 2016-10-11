job("ci_seed_initial") {
    steps {
        dsl {
            external('initial_seed.groovy')
            removeAction('DISABLE')
        }
    }
}
