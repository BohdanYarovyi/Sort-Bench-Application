package com.maybyes.sortbench.app.util.algorithm.loader;

import com.maybyes.sortbench.app.util.algorithm.impl.BubbleSortAlgorithm;
import com.maybyes.sortbench.app.util.algorithm.impl.InsertionSortAlgorithm;
import com.maybyes.sortbench.app.util.algorithm.impl.MergeSortAlgorithm;
import com.maybyes.sortbench.app.util.algorithm.impl.QuickSortAlgorithm;
import com.maybyes.sortbench.app.util.algorithm.impl.QuickSortMedianAlgorithm;
import com.maybyes.sortbench.app.util.algorithm.impl.SelectionSortAlgorithm;
import io.github.bohdanyarovyi.abstraction.SortAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BuiltinAlgorithmLoader {

    public List<SortAlgorithm> load() {
        List<SortAlgorithm> algorithms = new ArrayList<>();
        algorithms.add(new BubbleSortAlgorithm());
        algorithms.add(new InsertionSortAlgorithm());
        algorithms.add(new MergeSortAlgorithm());
        algorithms.add(new QuickSortAlgorithm());
        algorithms.add(new QuickSortMedianAlgorithm());
        algorithms.add(new SelectionSortAlgorithm());

        log.info("Loaded builtin algorithms: {}", algorithms);

        return algorithms;
    }

}