package com.ruoyi.project.system.brfpb.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.brfpb.domain.TBrfpb;
import com.ruoyi.project.system.brfpb.service.ITBrfpbService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 病人分配Controller
 *
 * @author helen
 * @date 2023-04-21
 */
@Controller
@RequestMapping("/system/brfpb")
public class TBrfpbController extends BaseController {
    private String prefix = "system/brfpb";

    @Autowired
    private ITBrfpbService tBrfpbService;

    @RequiresPermissions("system:brfpb:view")
    @GetMapping()
    public String brfpb() {
        return prefix + "/brfpb";
    }

    /**
     * 查询病人分配列表
     */
    @RequiresPermissions("system:brfpb:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TBrfpb tBrfpb) {
        startPage();
        List<TBrfpb> list = tBrfpbService.selectTBrfpbList(tBrfpb);
        return getDataTable(list);
    }

    /**
     * 导出病人分配列表
     */
    @RequiresPermissions("system:brfpb:export")
    @Log(title = "病人分配", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TBrfpb tBrfpb) {
        List<TBrfpb> list = tBrfpbService.selectTBrfpbList(tBrfpb);
        ExcelUtil<TBrfpb> util = new ExcelUtil<TBrfpb>(TBrfpb.class);
        return util.exportExcel(list, "病人分配数据");
    }

    /**
     * 新增病人分配
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存病人分配
     */
    @RequiresPermissions("system:brfpb:add")
    @Log(title = "病人分配", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TBrfpb tBrfpb) {
        return toAjax(tBrfpbService.insertTBrfpb(tBrfpb));
    }

    /**
     * 修改病人分配
     */
    @RequiresPermissions("system:brfpb:edit")
    @GetMapping("/edit/{brtjh}")
    public String edit(@PathVariable("brtjh") String brtjh, ModelMap mmap) {
        TBrfpb tBrfpb = tBrfpbService.selectTBrfpbByBrtjh(brtjh);
        mmap.put("tBrfpb", tBrfpb);
        return prefix + "/edit";
    }

    /**
     * 修改保存病人分配
     */
    @RequiresPermissions("system:brfpb:edit")
    @Log(title = "病人分配", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TBrfpb tBrfpb) {
        return toAjax(tBrfpbService.updateTBrfpb(tBrfpb));
    }

    /**
     * 删除病人分配
     */
    @RequiresPermissions("system:brfpb:remove")
    @Log(title = "病人分配", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tBrfpbService.deleteTBrfpbByBrtjhs(ids));
    }
}
